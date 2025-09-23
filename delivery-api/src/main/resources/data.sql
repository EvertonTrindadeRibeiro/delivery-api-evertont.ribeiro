-- Clientes
INSERT INTO cliente (id, nome, email) VALUES (1, 'João Silva', 'joao@email.com');
INSERT INTO cliente (id, nome, email) VALUES (2, 'Maria Oliveira', 'maria@email.com');

-- Restaurantes
INSERT INTO restaurante (id, nome, categoria, ativo) VALUES (1, 'Pizza Prime', 'Pizza', true);
INSERT INTO restaurante (id, nome, categoria, ativo) VALUES (2, 'Sushi House', 'Japonesa', true);

-- Produtos
INSERT INTO produto (id, nome, descricao, preco, categoria, disponivel, restaurante_id) VALUES
(1, 'Pizza Margherita', 'Clássica com tomate e manjericão', 39.90, 'Pizza', true, 1),
(2, 'Pizza Calabresa', 'Com cebola e azeitonas', 42.90, 'Pizza', true, 1),
(3, 'Sushi Salmão', '8 unidades de sushi de salmão', 29.90, 'Japonesa', true, 2);

-- Pedidos
INSERT INTO pedido (id, cliente_id, restaurante_id, data_pedido, status) VALUES
(1, 1, 1, CURRENT_DATE, 'REALIZADO'),
(2, 2, 2, CURRENT_DATE, 'EM_PREPARO');
